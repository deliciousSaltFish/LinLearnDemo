/**
 * 
 */
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
public class ProjectIterator implements IProjectIterator
{
	private ArrayList<IProject> projectList = new ArrayList<IProject>();
	private int currentItem = 0;

	/**
	 * Description:
	 * 1
	 * LinLearnDemo
	 *
	 * @Date: 2019/1/28 20:36
	 * @Author: James Lin
	 * @Version: 1.0
	 */
	public ProjectIterator(ArrayList<IProject> projectList)
	{
		this.projectList = projectList;
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see java.util.Iterator#hasNext()
	 */
	public boolean hasNext()
	{
		// 定义一个返回值
		boolean b = true;
		if (this.currentItem >= projectList.size()
				|| this.projectList.get(this.currentItem) == null)
		{
			b = false;
		}
		return b;
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see java.util.Iterator#next()
	 */
	public Project next()
	{
		return (Project) this.projectList.get(this.currentItem++);

	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see java.util.Iterator#remove()
	 */
	public void remove()
	{
		// TODO Auto-generated method stub

	}

}
