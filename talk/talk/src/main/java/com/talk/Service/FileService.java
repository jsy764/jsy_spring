package com.talk.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import lombok.extern.java.Log;

@Service
@Log
public class FileService {
	@Value("${filePath}")
	private String filePath;
	
	public String uploadFile(MultipartFile multipartFile) {
		//String originalName = multipartFile.getOriginalFilename(); // 원본이름
		String originalName = multipartFile.getOriginalFilename();
		String fileName="";
		String fileUrl="";
		fileName = fileSave(originalName, multipartFile.getBytes());
		fileUrl="/files/"+fileName; // 웹(html)에서 사용할 파일 경로
		return fileUrl;
		
	}
	public List<String> uploadFile(List<MultipartFile> multipartFiles) {
		
		List<String> fileUrls = new ArrayList<>();
		
		for(MultipartFile multipartFile : multipartFiles) {
			String fileurl = uploadFile(multipartFile);
			fileUrls.add(fileurl);
		}
		return fileUrls;
	}
}
