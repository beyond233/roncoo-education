package com.roncoo.education.gateway.common;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 菜单信息
 *
 * @author wujing
 */
@Data
@Accessors(chain = true)
public class SysMenuVO implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
	private Long id;
	/**
	 * 创建时间
	 */
	private Date gmtCreate;
	/**
	 * 修改时间
	 */
	private Date gmtModified;
	/**
	 * 状态(1:正常，0:禁用)
	 */
	private Integer statusId;
	/**
	 * 排序
	 */
	private Integer sort;
	/**
	 * 父ID
	 */
	private Long parentId;
	/**
	 * 菜单名称
	 */
	private String menuName;
	/**
	 * 菜单路径
	 */
	private String menuUrl;
	/**
	 * 菜单图标
	 */
	private String menuIcon;
	/**
	 * 目标名称
	 */
	private String targetName;
	/**
	 * 备注
	 */
	private String remark;
	/**
	 * 菜单集合
	 */
	List<SysMenuVO> list;

}