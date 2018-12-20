package top.wfzzq.supermarckeonline.service;

import top.wfzzq.supermarckeonline.model.TbSubTypeModel;
import top.wfzzq.supermarckeonline.utils.JsonMessage;
/**
 * 
 * @author wanghui
 *
 */
public interface SubTypeService {
    
    /**
     * 
     * @param model
     * @return
     * @throws Exception
     */
    JsonMessage disable(TbSubTypeModel model) throws Exception;
    /**
     * 
     * @param model
     * @return
     * @throws Exception
     */
    JsonMessage enable(TbSubTypeModel model) throws Exception;
    /**
     * 
     * @param model
     * @return
     * @throws Exception
     */
    JsonMessage update(TbSubTypeModel model) throws Exception;
     /**
      * 
      * @param model
      * @return
      * @throws Exception
      */
    JsonMessage add(TbSubTypeModel model) throws Exception;
    JsonMessage queryAll(TbSubTypeModel model) throws Exception;
    

}
