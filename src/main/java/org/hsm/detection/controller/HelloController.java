package org.hsm.detection.controller;

import org.hsm.detection.model.Message;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @RequestMapping("/")
    public String index(@ModelAttribute(value = "message") Message message, ModelMap map) {
        //  加入一个属性，用来在模板中读取
        //  map.addAttribute("sex", 0);
        //  return模板文件的名称，对应src/main/resources/templates/index.html
        return "index";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String save(@ModelAttribute(value = "message") Message message, ModelMap map) {

        String test1 = message.getTest1() + message.getTest2() + message.getTest3() + message.getTest4() + message.getTest5() + message.getTest6() + message.getTest7() + message.getTest8()
                + message.getTest9() + message.getTest10() + message.getTest11() + message.getTest12() + message.getTest13() + message.getTest14() + message.getTest15();

        String test2 = message.getTest16() + message.getTest17() + message.getTest18() + message.getTest19() + message.getTest20() + message.getTest21() + message.getTest22() + message.getTest23()
                + message.getTest24() + message.getTest25() + message.getTest26() + message.getTest27() + message.getTest28() + message.getTest29() + message.getTest30();

        int A = StringUtils.countOccurrencesOf(test1,"A");
        int B = StringUtils.countOccurrencesOf(test1,"B");
        int C = StringUtils.countOccurrencesOf(test1,"C");
        int D = StringUtils.countOccurrencesOf(test1,"D");

        int A2 = StringUtils.countOccurrencesOf(test2,"A");
        int B2 = StringUtils.countOccurrencesOf(test2,"B");
        int C2 = StringUtils.countOccurrencesOf(test2,"C");
        int D2 = StringUtils.countOccurrencesOf(test2,"D");

        String 红色 =  A+D2 +"%红;";
        String 蓝色 =  B+C2 +"%蓝;";
        String 黄色 =  C+B2 +"%黄;";
        String 绿色 =  D+A2 +"%绿。";

        String result1 =" 【红色】:行动者。红色性格的人是快节奏的人，会自发地行动和做出决策。他不关心事实和细节，并尽可能地逃避一些繁琐的工作。这种不遵循事实的特性经常会让他夸大其词。红色性格的人与分析研究相对比更喜欢随意猜测。他对组织活动充满兴趣，能够快速并热情地与人相处。红色性格的人一直追逐梦想，他有着不可思议的能力能够让别人和他一起实现梦想，他有非常强的说服能力。他一直寻求别人对他的成就给予赞扬。红色性格的人是很有创意的人，思维敏捷。红色的劣势是，会被人认为是主观的、鲁莽的、易冲动的。 ";
        String result2 =" 【蓝色】：思想者。蓝色性格的人注重思考过程，能够全面、系统性的解决问题。他非常关心事物的安全性，任何事情都追求正确无误。所以这种人热衷于收集数据，询问很多有关于细节的问题。他的行动和决策都是非常谨慎的。蓝色性格的人做事缓慢，要求准确，喜欢有组织、有构架的，知识性的工作环境。这种性格的人比较容易多疑，且喜欢将事情记录下来。蓝色虽然是一个很好的问题解决者，但同时又是一个并不果断的决策者。当需要作决策时，他往往为了收集数据耽误了时间，经常性被他们引以为豪的口头禅是：“你不可能只掌握一半的数据就做出一项重要的决定吧。”蓝色的劣势是，会被认为是有距离的、挑剔的，和严肃的。 ";
        String result3 =" 【黄色】：领导者。黄色性格的人是非常直接的，同时也很严谨。黄色性格的人善于控制他人和环境，果断行动和决策。这种性格的人行动非常迅速，对拖延非常没有耐心。当别人不能跟上他们的节奏，他会认为他们没有能力。黄色性格的人的座右铭是“我要做得又快又好”。黄色性格的人是典型的执行者，他们有很强的自我管理能力，他们自觉完成工作并给予自己新的任务。黄色性格的人喜欢同时做很多事情。他可以同时做三件事，并尽可能做第四件事。他会持续给自己加压一直到自己无法承受的最高点，之后稍事放松。然而很快他又会重新开始整个进程。不过，和别人交往时，黄色的劣势是，常常表现冷漠，以产出和目标为导向，更关心最后的结果，会被认为是固执、缺乏耐心、强硬和专横。";
        String result4 =" 【绿色】：和平者。绿色性格的人追求安全感和归属感，和蓝色一样做事和决策慢，不同的是这种拖延是因为绿色性格的人不愿冒风险。在他行动或作决策之前，他希望能够先了解别人的感受。绿色性格的人是四种性格中最以人际为导向的人。对这种性格最适合的形容词是亲近的、友好的。绿色性格的人不喜欢与人发生冲突，所以有时他会说别人想听的话而不是他心里想的话。绿色性格的人有很强的劝说能力，非常愿意支持其他人。他也是一个积极的聆听者。作为他的伙伴你会感觉很舒服。因为绿色性格的人很愿意听别人说，因此轮到他说的时候，别人也愿意听他说，因此他有很强的能力获得别人的支持。绿色的劣势是，会被人认为过于温和，心肠太软，老好人。";
        map.addAttribute("result", "比重："+红色+蓝色+黄色+绿色+"说明:"+result1+result2+result3+result4);
        return "index";
    }



}