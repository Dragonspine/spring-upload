package hello.upload.controller;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * packageName    : hello.upload.controller
 * fileName       : ItemForm
 * author         : kanghyun Kim
 * date           : 2022/10/04
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/10/04        kanghyun Kim      최초 생성
 */
@Data
public class ItemForm {

    private Long itemId;
    private String itemName;
    private MultipartFile attachFile;
    private List<MultipartFile> imageFiles;

}
