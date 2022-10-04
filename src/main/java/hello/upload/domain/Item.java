package hello.upload.domain;

import lombok.Data;

import java.util.List;

/**
 * packageName    : hello.upload.domain
 * fileName       : Item
 * author         : kanghyun Kim
 * date           : 2022/10/04
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/10/04        kanghyun Kim      최초 생성
 */
@Data
public class Item {
    private Long id;
    private String itemName;
    private UploadFile attachFile; // 첨부파일
    private List<UploadFile> imageFiles; // 이미지 파일 리스트
}
