单例模式

饿汉模式：在类创建的时候就实例单例类，缺点是非常耗时

懒汉模式：在类创建的时候不创建单例类，在getInstance的时候判断单例是否为null，为null才创建，
缺点多线程下会出错

加锁的懒汉模式：在类创建的时候不创建单例类，在加上synchronized锁的getInstance的时候判断单例是否
为null，为null才创建。缺点多线程下运行，由于synchronized修饰同步块，则性能会下降

双检查的加锁的单例模式：判断实例是否存在，不存在锁定单例类，再次判断是否存在实例对象，
不存在实例化对象；性能和线程问题都解决，volatile修饰的写变量不能和之前的读写代码调整，
读变量不能和之后的读写代码调整