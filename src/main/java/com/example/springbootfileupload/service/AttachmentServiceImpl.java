package com.example.springbootfileupload.service;

import antlr.StringUtils;
import com.example.springbootfileupload.entity.Attachment;
import com.example.springbootfileupload.repository.AttachmentRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.Optional;

import static antlr.StringUtils.*;
import static org.springframework.util.StringUtils.cleanPath;

@Service
public class AttachmentServiceImpl implements AttachmentService  {
    // need to reference the repository

    private AttachmentRepository attachmentRepository;

    public AttachmentServiceImpl(AttachmentRepository attachmentRepository) {
        this.attachmentRepository = attachmentRepository;
    }

    @Override
    public Attachment saveAttachment(MultipartFile file) {
       String fileName = cleanPath(file.getOriginalFilename());
       try{
           if(fileName.contains("..")) {
               throw new Exception("Filename contains invalid path sequence" + fileName);

           }
            Attachment attachment
                    = new Attachment(fileName,
                    file.getContentType(),
                    file.getBytes());

           return attachmentRepository.save(attachment);

       } catch (Exception e) {
           throw new RuntimeException("Could not save File" + fileName);
       }
    }



    @Override
    public Attachment getAttachment(String fileId) throws Exception {
        return attachmentRepository
                .findById( fileId)
                .orElseThrow(
                        () -> new Exception("File not found with Id: " + fileId));
    }



    private Optional<Attachment> findById(String fileId) {
        return Optional.empty();
    }


}
