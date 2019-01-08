package top.wfzzq.supermarckeonline.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import top.wfzzq.supermarckeonline.base.BaseAdminUserController;
import top.wfzzq.supermarckeonline.model.TbSubTypeModel;
import top.wfzzq.supermarckeonline.service.SubTypeService;
import top.wfzzq.supermarckeonline.utils.JsonMessage;
/**
 * 
 * @author wanghui
 *
 */
@RestController
@RequestMapping("/subtype")
public class SubTypeController extends BaseAdminUserController{
    @Autowired
    private SubTypeService subTypeService;

    @RequestMapping("/disable")
    public JsonMessage disable(TbSubTypeModel model) throws Exception {
      return subTypeService.disable(model);
    }

    @RequestMapping("/enable")
    public JsonMessage enable(TbSubTypeModel model) throws Exception {
      return subTypeService.enable(model);
    }

    @RequestMapping("/queryAll")
    public JsonMessage queryAll(TbSubTypeModel model) throws Exception {
        return subTypeService.queryAll(model);
    }

    @RequestMapping("/add")
    public JsonMessage add(TbSubTypeModel model) throws Exception {
      return subTypeService.add(model);
    }

    @RequestMapping("/update")
    public JsonMessage update(TbSubTypeModel model) throws Exception {
      return subTypeService.update(model);
    }
}
