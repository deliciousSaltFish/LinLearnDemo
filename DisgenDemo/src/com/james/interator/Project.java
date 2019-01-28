package com.james.interator;

import java.util.ArrayList;
/**
 * Description:
 * 1
 * LinLearnDemo
 *
 * @Date: 2019/1/28 20:36
 * @Author: James Lin
 * @Version: 1.0
 */
public class Project implements IProject
{

	private ArrayList<IProject> projectList = new ArrayList<IProject>();
	private String name = "";
	private int num = 0;
	private int cost = 0;

	public Project(String name, int num, int cost)
	{
		super();
		this.name = name;
		this.num = num;
		this.cost = cost;
	}

	public Project()
	{

	}

	public void add(String name, int num, int cost)
	{
		this.projectList.add(new Project(name, num, cost));

	}

	public String getProjectInfo()
	{
		String info = "";
		// 获得项目的名称
		info = info + "项目名称是:" + this.name;
		// 获得项目人数
		info = info + "\t项目人数: " + this.num;
		// 项目费用
		info = info + "\t 项目费用:" + this.cost;
		return info;
	}

	public IProjectIterator iteratror()
	{

		return new ProjectIterator(this.projectList);

	}

}
