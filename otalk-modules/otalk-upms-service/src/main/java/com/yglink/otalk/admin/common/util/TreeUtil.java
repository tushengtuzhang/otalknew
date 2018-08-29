package com.yglink.otalk.admin.common.util;

import com.yglink.otalk.admin.dto.MenuTree;
import com.yglink.otalk.admin.dto.TreeNode;
import com.yglink.otalk.admin.entity.AdminMenu;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangtusheng
 */
public class TreeUtil{

    /**
     * 两层循环实现建树
     * @param treeNodes 传入的树节点列表
     * @param root 根
     * @param <T> extends TreeNode
     * @return extends TreeNode
     */
    public static <T extends TreeNode> List<T> build(List<T> treeNodes, Object root){

        List<T> trees=new ArrayList<>();
        for (T treeNode : treeNodes) {

            if (root.equals(treeNode.getParentId())) {
                trees.add(treeNode);
            }

            for (T it : treeNodes) {
                if (it.getParentId().equals(treeNode.getId())) {
                    if (treeNode.getChildren() == null) {
                        treeNode.setChildren(new ArrayList<>());
                    }
                    treeNode.add(it);
                }
            }
        }

        return trees;
    }

    /**
     * 使用递归方法建树
     *
     * @param treeNodes treeNodes
     * @return T
     */
    public static <T extends TreeNode> List<T> buildByRecursive(List<T> treeNodes, Object root) {
        List<T> trees = new ArrayList<>();
        for (T treeNode : treeNodes) {
            if (root.equals(treeNode.getParentId())) {
                trees.add(findChildren(treeNode, treeNodes));
            }
        }
        return trees;
    }

    /**
     * 递归查找子节点
     *
     * @param treeNodes treeNodes
     * @return T
     */
    public static <T extends TreeNode> T findChildren(T treeNode, List<T> treeNodes) {
        for (T it : treeNodes) {
            if (treeNode.getId().equals(it.getParentId())) {
                if (treeNode.getChildren() == null) {
                    treeNode.setChildren(new ArrayList<>());
                }
                treeNode.add(findChildren(it, treeNodes));
            }
        }
        return treeNode;
    }

    /**
     * 通过sysMenu创建树形节点
     *
     * @param menus menus
     * @param root root
     * @return list
     */
    public static List<MenuTree> buildTree(List<AdminMenu> menus, int root) {
        List<MenuTree> trees = new ArrayList<>();
        MenuTree node;
        for (AdminMenu menu : menus) {
            node = new MenuTree();
            node.setId(menu.getId());
            node.setParentId(menu.getParentId());
            node.setName(menu.getName());
            node.setUrl(menu.getUrl());
            node.setPath(menu.getPath());
            node.setCode(menu.getPermission());
            node.setLabel(menu.getName());
            node.setComponent(menu.getComponent());
            node.setIcon(menu.getIcon());
            trees.add(node);
        }
        return TreeUtil.build(trees,root);
    }
}
