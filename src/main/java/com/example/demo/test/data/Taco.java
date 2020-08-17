package com.example.demo.test.data;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

/**
 * @Description:
 * @Author: lyk
 * @Date: 2020/8/12 22:18
 */
@Data
public class Taco {
    @NotNull
    @Size(min = 5, message = "名字必须在5-10位之间")
    private String name;
    private List<String> ingredients;
}
