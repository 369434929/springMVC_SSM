import com.blog.entity.Types;
import com.blog.service.TypesService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.UUID;

public class TypesServiceImplTest {
    @Test
    public static void main (String args[]){
        String [] stringarr=new String[] {
                 "生活","原创","效率","激励","摄影","系统","任务清单","资源","职业","任务","项目","信息","设计","动力"
                ,"完美主义","阅读","管理","职场","简化","坚持","博客","写作","设计","考试","锻炼","性格","注意力"
                ,"禅","插件","勤奋","笔记","跑步","甘特图","周年回顾","演讲之禅","择业","头脑风暴","减肥","旅行记事","灵感"};
        int number =4;
        for (int i = 0 ;i<stringarr.length; i++){
            Types types = new Types();
            types.setTypeId(UUID.randomUUID().toString().replaceAll("-", ""));
            types.setType(number);
            types.setTypeExplain(stringarr[i]);
            ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
            TypesService typesService = (TypesService) context.getBean("typesService");
            typesService.insert(types);
        }
    }
}
