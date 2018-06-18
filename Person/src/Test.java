
public class Test {

	public static void main(String[] args){

		Person taro = new Person();

		taro.name = "taro";
		taro.age = 18;
		System.out.println(taro.name);
		System.out.println(taro.age);

		Person yamada = new Person("山田太郎",20);
		System.out.println(yamada.name);
		System.out.println(yamada.age);

		Person kimura = new Person("木村次郎",18);
		System.out.println(kimura.name);
		System.out.println(kimura.age);

		Person suzuki = new Person("鈴木花子",16);
		System.out.println(suzuki.name);
		System.out.println(suzuki.age);

		Person negishi = new Person("根岸彩香",24);
		System.out.println(negishi.name);
		System.out.println(negishi.age);


		Person jiro = new Person("jiro",20);
		System.out.println(jiro.name);
		System.out.println(jiro.age);


		Person saburo = new Person("saburo");
		System.out.println(saburo.name);
		System.out.println(saburo.age);


		Person noname = new Person(25);
		System.out.println(noname.name);
		System.out.println(noname.age);


		Person hanako = new Person(17,"hanako");
		System.out.println(hanako.name);
		System.out.println(hanako.age);

		Person a = new Person("aaa@com","ayaka");
		System.out.println(a.address);
		System.out.println(a.name);


		taro.talk();
		taro.walk();
		taro.run();

		Robot aibo = new Robot("aibo");
		aibo.talk();
		aibo.walk();
		aibo.run();

		Robot asimo = new Robot("asimo");
		asimo.talk();
		asimo.walk();
		asimo.run();

		Robot pepper = new Robot("pepper");
		pepper.talk();
		pepper.walk();
		pepper.run();

		Robot doraemon = new Robot("doraemon");
		doraemon.talk();
		doraemon.walk();
		doraemon.run();











 }



}



