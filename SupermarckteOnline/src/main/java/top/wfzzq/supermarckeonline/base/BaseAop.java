package top.wfzzq.supermarckeonline.base;

import org.aspectj.lang.annotation.Pointcut;

/**
 * aop的基础类，配置切面
 *
 * @author DarkKnight
 *
 */
public abstract class BaseAop {
  /**
   * -控制器切面
   */
  @Pointcut("execution(public * top.wfzzq.supermarckeonline.controller..*.*(..))")
  public void controllerPointcut() {
  }

}
