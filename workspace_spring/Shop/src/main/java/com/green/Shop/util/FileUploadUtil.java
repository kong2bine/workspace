package com.green.Shop.util;

import com.green.Shop.item.vo.ImgVO;
import com.green.Shop.item.vo.ItemVO;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

//첨부파일과 관련된 기능
public class FileUploadUtil {

    //파일 업로드
    public static ImgVO fileUpload(MultipartFile uploadFile){
        //원본 파일명 및 첨부된 파일명을 저장하기 위한 객체
        ImgVO imgVO = null;

        //input 태그에 파일을 선택했을 때만 첨부기능 실행
        if(!uploadFile.isEmpty()){
            //imgVO 객체 생성
            imgVO = new ImgVO();

            //업로드 될 경로
            String uploadPath = "D:\\01-STUDY\\dev\\workspace\\workspace_spring\\Shop\\src\\main\\resources\\static\\upload\\";

            //내가 선택한 원본 파일명
            String originFileName = uploadFile.getOriginalFilename();

            //첨부될 파일명 랜덤 생성
            String uuid = UUID.randomUUID().toString();

            //원본 파일에서 확장자만 추출
                // String a = "abc.jpg";
                // a.substring(3);

                //String b = "ab.cd.ef";
                //indexOf : 찾는 문자의 index (위치)
                //b.lastIndexOf(".");

            //어떤 파일이 있어도 확장자만 추출할 수 있는 코드
            //abc.jpg
            //java.xlsx
            //python.pdf
            String extension = originFileName.substring(originFileName.lastIndexOf("."));

            //첨부될 파일명
            String attachedFileName = uuid + extension;

            //첨부될 파일 생성
            File file = new File(uploadPath + attachedFileName);

            //첨부 기능 실행
            try {
                uploadFile.transferTo(file);

                //첨부된 파일 정보를 imgVO에 저장
                imgVO.setOriginFileName(originFileName);
                imgVO.setAttachedFileName(attachedFileName);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        return imgVO;

    }
}
