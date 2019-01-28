package com.james.interator;
/**
 * Description:
 * 1
 * LinLearnDemo
 *
 * @Date: 2019/1/28 20:36
 * @Author: James Lin
 * @Version: 1.0
 */
public class Boss
{
	public static int num=10;
	public static void main(String[] args)
	{
		IProject project = new Project();
		for (int i=0;i<num;i++){
			project.add("项目"+i,i,1000*i);
		}
		IProjectIterator projectIterator = project.iteratror();
		while (projectIterator.hasNext())
		{
			IProject p = (IProject) projectIterator.next();
			System.out.println(p.getProjectInfo());
		}

	}
}
