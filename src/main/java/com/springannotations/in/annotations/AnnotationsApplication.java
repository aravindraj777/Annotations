package com.springannotations.in.annotations;

import com.springannotations.in.annotations.controller.MyController;
import com.springannotations.in.annotations.controller.PizzaController;
import com.springannotations.in.annotations.lazy.LazyLoader;
import com.springannotations.in.annotations.propertysource.PropertySourceDemo;
import com.springannotations.in.annotations.repository.MyRepository;
import com.springannotations.in.annotations.scope.PrototypeBean;
import com.springannotations.in.annotations.scope.SingletonBean;
import com.springannotations.in.annotations.service.MyService;
import com.springannotations.in.annotations.service.NonVegPizzza;
import com.springannotations.in.annotations.service.VegPizza;
import com.springannotations.in.annotations.value.ValueAnnotationDemo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@SpringBootApplication
public class AnnotationsApplication {

	public static void main(String[] args) {
		var context =SpringApplication.run(AnnotationsApplication.class, args);
//		PizzaController pizzaController = (PizzaController) context.getBean("pizzaController");
//		System.out.println(pizzaController.getpizza());


		MyController myController = context.getBean(MyController.class);
		System.out.println(myController.hello());

//		@Service implementation
		MyService myService= context.getBean(MyService.class);
		System.out.println(myService.hello());

		MyRepository myRepository = context.getBean(MyRepository.class);
		System.out.println(myRepository.hello());

		LazyLoader lazyLoader = context.getBean(LazyLoader.class);

		SingletonBean singletonBean = context.getBean(SingletonBean.class);
		System.out.println(singletonBean.hashCode());

		SingletonBean singletonBean1 = context.getBean(SingletonBean.class);
		System.out.println(singletonBean1.hashCode());

		SingletonBean singletonBean2 = context.getBean(SingletonBean.class);
		System.out.println(singletonBean2.hashCode());

		PrototypeBean prototypeBean = context.getBean(PrototypeBean.class);
		System.out.println(prototypeBean.hashCode());

		PrototypeBean prototypeBean1 = context.getBean(PrototypeBean.class);
		System.out.println(prototypeBean1.hashCode());

		PrototypeBean prototypeBean2 = context.getBean(PrototypeBean.class);
		System.out.println(prototypeBean2.hashCode());

//      @value implementation
		ValueAnnotationDemo valueAnnotationDemo = context.getBean(ValueAnnotationDemo.class);
		System.out.println(valueAnnotationDemo.getDefaultName());
		System.out.println(valueAnnotationDemo.getDefaultvalue());
		System.out.println(valueAnnotationDemo.getHost());
		System.out.println(valueAnnotationDemo.getEmail());
		System.out.println(valueAnnotationDemo.getPassword());

		System.out.println(valueAnnotationDemo.getJava());
//		System.out.println(valueAnnotationDemo.getHomeDir());

		System.out.println();

		PropertySourceDemo propertySourceDemo = context.getBean(PropertySourceDemo.class);
		System.out.println(propertySourceDemo.getHost());
		System.out.println(propertySourceDemo.getEmail());
		System.out.println(propertySourceDemo.getPassword());
		System.out.println(propertySourceDemo.getUsername());
		System.out.println(propertySourceDemo.getAdduser());


//		VegPizza vegPizza = (VegPizza) context.getBean("vegpizza");
//		System.out.println(vegPizza.getPizza());
//		NonVegPizzza nonVegPizzza = (NonVegPizzza) context.getBean("nonveg");
//		System.out.println(nonVegPizzza.getPizza());
	}

}
