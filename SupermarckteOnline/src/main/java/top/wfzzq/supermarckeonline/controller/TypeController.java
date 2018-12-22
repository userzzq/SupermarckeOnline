package top.wfzzq.supermarckeonline.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import top.wfzzq.supermarckeonline.model.TbTypeModel;
import top.wfzzq.supermarckeonline.service.TypeService;
import top.wfzzq.supermarckeonline.utils.JsonMessage;

/**
 * 
 * @author wanghui
 *
 */
@RestController
@RequestMapping("/type")
public class TypeController {
    @Autowired
    private TypeService typeService;
    
    @RequestMapping("/queryAll")
    public JsonMessage queryAll(TbTypeModel model) throws Exception{
        return typeService.queryAll(model);
    }
    @RequestMapping("/add")
    public JsonMessage add(TbTypeModel model) throws Exception{
        // /type/add?token=2ewr2312-34ee324sf34wer23fwfw328ewdjf23w32kwrfw34
        // &tbType.typeName=服务&tbType.typeInfo=服务类型
        return typeService.add(model);
    }
    
    @RequestMapping("/queryByKey")
    public JsonMessage queryByKey(TbTypeModel model) throws Exception{
        // /type/queryByKey?
         return typeService.queryByKey(model);
    }
        
    @RequestMapping("/undelete")
    public JsonMessage undelete(TbTypeModel model) throws Exception{
         return typeService.undelete(model);
    }
   
    @RequestMapping("/delete")
    public JsonMessage delete(TbTypeModel model) throws Exception{
        // /type/delete?
         return typeService.delete(model);
    }
    @RequestMapping("/update")
    public JsonMessage update(TbTypeModel model) throws Exception{
        return typeService.update(model);
    }
}
