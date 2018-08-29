package com.yglink.otalk.admin.dto;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangtusheng
 */
@Data
public class TreeNode {
    protected Integer id;
    protected Integer parentId;

    protected List<TreeNode> children=new ArrayList<>();

    public void add(TreeNode node){
        children.add(node);
    }
}
