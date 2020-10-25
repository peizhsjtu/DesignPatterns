package designpatterns.factory.JDKDemo;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

/**
 * 简单工厂在Calendar类中的使用
 *
 *
 * 1)工厂模式的意义
 * 将实例化对象的代码提取出来，放到一个类中统一管理和维护，达到和主项目的依赖关系的解耦。从而提高项目的扩展和维护性。
 * 2)三种工厂模式 (简单工厂模式、工厂方法模式、抽象工厂模式)
 * 3)设计模式的依赖抽象原则
 *
 * 创建对象实例时，不要直接 new 类, 而是把这个 new 类的动作放在一个工厂的方法中，并返回。有的书上说， 变量不要直接持有具体类的引用。
 * 不要让类继承具体类，而是继承抽象类或者是实现 interface(接口)
 * 不要覆盖基类中已经实现的方法。
 */
public class CalendarTest {
    public static void main(String[] args) {
// TODO Auto-generated method stub
// getInstance 是 Calendar 静态方法
        Calendar cal = Calendar.getInstance();
// 注意月份下标从 0 开始，所以取月份要+1
        System.out.println("年:" + cal.get(Calendar.YEAR));
        System.out.println(" 月 :" + (cal.get(Calendar.MONTH) + 1)); System.out.println("日:" + cal.get(Calendar.DAY_OF_MONTH));
        System.out.println("时:" + cal.get(Calendar.HOUR_OF_DAY));
        System.out.println("分:" + cal.get(Calendar.MINUTE));
        System.out.println("秒:" + cal.get(Calendar.SECOND));

    }

}
//Calendar.java



/*

    public static Calendar getInstance()
    {
        return createCalendar(TimeZone.getDefault(), Locale.getDefault(Locale.Category.FORMAT));
    }
    private static Calendar createCalendar(TimeZone zone,
                                           Locale aLocale) //根据 TimeZone zone, locale 创建对应的实例
    {
        CalendarProvider provider = LocaleProviderAdapter.getAdapter(CalendarProvider.class, aLocale)
                .getCalendarProvider();
        if (provider != null) { try {
            return provider.getInstance(zone, aLocale);
        } catch (IllegalArgumentException iae) {
// fall back to the default instantiation
        }
        }


        Calendar cal = null;


        if (aLocale.hasExtensions()) {
            String caltype = aLocale.getUnicodeLocaleType("ca"); if (caltype != null) {


                switch (caltype) { case "buddhist":
                    cal = new BuddhistCalendar(zone, aLocale);
                    break;
                    case "japanese":
                        cal = new JapaneseImperialCalendar(zone, aLocale);
                        break; case "gregory":
                        cal = new GregorianCalendar(zone, aLocale);
                        break;
                }
            }
        }
        if (cal == null) {
// If no known calendar type is explicitly specified,
// perform the traditional way to create a Calendar:
// create a BuddhistCalendar for th_TH locale,
// a JapaneseImperialCalendar for ja_JP_JP locale, or
// a GregorianCalendar for any other locales.
// NOTE: The language, country and variant strings are interned.
            if (aLocale.getLanguage() == "th" && aLocale.getCountry() == "TH") { cal = new BuddhistCalendar(zone, aLocale);
            } else if (aLocale.getVariant() == "JP" && aLocale.getLanguage() == "ja" && aLocale.getCountry() == "JP") {
                cal = new JapaneseImperialCalendar(zone, aLocale);
            } else {


                cal = new GregorianCalendar(zone, aLocale);
            }
        }
        return cal;
    }*/
