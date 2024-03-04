package com.HAH.demo.aspects;

import org.aspectj.lang.JoinPoint;

public class DemoAspects {

	public void beforeInvocation(JoinPoint joinPoint) {

		var target = joinPoint.getTarget();
		var proxy = joinPoint.getThis();
		var args = joinPoint.getArgs();

		System.out.println("-----------------------------");
		System.out.println("Before Method Invocation");
		System.out.println("%-10s: %s".formatted("Target", target.getClass().getSimpleName()));
		System.out.println("%-10s: %s".formatted("Proxy", proxy.getClass().getSimpleName()));
		System.out.println("-----------------------------");

		for (int i = 0; i < args.length; i++) {
			var arg = args[i];
			System.out.println("%d. %-10s:%s".formatted(i + 1, arg.getClass().getSimpleName(), arg));
		}
		System.out.println("-----------------------------");
	}

}
