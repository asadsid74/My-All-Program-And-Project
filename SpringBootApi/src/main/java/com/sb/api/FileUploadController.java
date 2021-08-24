package com.sb.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FileUploadController {
	
	@PostMapping("/fileupload")
	public ResponseEntity<String> fileUpload(){
		return ResponseEntity.ok("working...");
		
	}

}
