package learner.wzn.load;
/*
*
* @Date: 2021/8/22
* @Description: 双亲委派
*
*   如果一个类加载器收到了类加载的请求，它首先不会自己去尝试加载这个类，
*   而是把这个请求委派给父类加载器去完成，每一个层次的类加载器都是如此，因此所有的加载请求最终都应该传送到顶层的启动类加载器中，
*   只有当父类加载器反馈自己无法完成这个类加载请求（它的搜索范围中没有找到所需的类）时，子加载器才会尝试自己去加载。
*
*   这样做的好处就是 Java 类随着它的类加载器一起具备了一种带有优先级的层次关系。
*   例如 java.lang.Object，它放在 rt.jar 中，无论哪一个类加载器要加载这个类，
*   最终都是委派给处于模型顶端的启动类加载器来加载，因此 Object 类在程序的各种类加载器环境中都是同一个类。
*   相反，如果没有使用双亲委派模型，由各个类加载器自行去加载的话，如果用户自己编写了一个称为 java.lang.Object 的类，
*   并放在程序的 ClassPath 中，那系统中将会出现多个不同的 Object 类，Java 类型体系中最基本的行为也就无法保证了。
*   双亲委派模型对于保证 Java 程序运行的稳定性很重要，但它的实现很简单，实现双亲委派模型的代码都集中在
*   java.lang.ClassLoader 的 loadClass() 方法中，逻辑很清晰：先检查是否已经被加载过，若没有则调用父类加载器的
*   loadClass() 方法，若父加载器为空则默认使用启动类加载器作为父加载器。如果父类加载失败，抛出 ClassNotFoundException
*   异常后，再调用自己的 findClass() 方法进行加载。
*
*   避免类被重复加载, 保护程序安全,防止核心API（如String.class由启动类加载器加载）被随意篡改
*/
public class ParentsDelegation_demo {

    public static void main(String[] args) {

    }

}
