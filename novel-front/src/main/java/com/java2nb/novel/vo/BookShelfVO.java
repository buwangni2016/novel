package com.java2nb.novel.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.java2nb.novel.entity.UserBookshelf;
import lombok.Data;

import javax.annotation.Generated;
import java.util.Date;

/**
 * @author 11797
 */
@Data
public class BookShelfVO extends UserBookshelf {

    private Integer catId;
    private String catName;
    private Long lastIndexId;

    private String lastIndexName;
    private String bookName;


    private String picUrl;

    private Long authorId;

    private String authorName;

    private String bookDesc;

    private Date lastIndexUpdateTime;

    private Byte bookStatus;


    @Override
    public String toString() {
        return super.toString();
    }
}
