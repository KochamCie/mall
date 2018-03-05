package com.hama.user.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author: hama
 * @date: created in  2018/3/5
 * @description:
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserEntity implements Serializable{

    private String id;

    private String name;
}
