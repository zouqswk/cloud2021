package com.zou.springcloud.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommentResult<T> {
    private Integer id;
    private String score;
    private T data;

    public CommentResult(Integer id, String score) {
        this(id,score,null);
    }
}
