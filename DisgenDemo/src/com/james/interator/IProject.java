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
public interface IProject
{
	/**
	 *  1
	 *
	 * @param  name
	 * @param  num
	 * @param  cost
	 * @return
	 * @Date: 2019/1/28-21:30
	 */
	public void add(String name, int num, int cost);
	/**
	 *  1
	 *
	 * @param
	 * @return
	 * @Date: 2019/1/28-21:30
	 */
	public String getProjectInfo();
	/**
	 *  1
	 *
	 * @param
	 * @return
	 * @Date: 2019/1/28-21:30
	 */
	public IProjectIterator iteratror();
}
