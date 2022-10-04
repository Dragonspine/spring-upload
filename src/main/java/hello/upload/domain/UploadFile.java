package hello.upload.domain;

import lombok.Data;

/**
 * packageName    : hello.upload.domain
 * fileName       : UploadFile
 * author         : kanghyun Kim
 * date           : 2022/10/04
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/10/04        kanghyun Kim      최초 생성
 */
@Data
public class UploadFile {
    private String uploadFileName; // 고객이 저장한 파일명
    private String storeFileName; // DB에 저장할 파일명

    public UploadFile(String uploadFileName, String storeFileName) {
        this.uploadFileName = uploadFileName;
        this.storeFileName = storeFileName;
    }
}
