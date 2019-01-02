package gaoxi.entity.user;

import java.util.List;

public class RoleEntity {
//      主键
    private String id;

//    角色名称
    private String name;

//    角色描述
    private String desc;

//    该角色能访问的菜单
    private List<MenuEntity> menuList;

//    该角色拥有的权限
    private List<PermissionEntity> permissionList;

    @Override
    public String toString() {
        return "RoleEntity{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                ", menuList=" + menuList +
                ", permissionList=" + permissionList +
                '}';
    }
}
