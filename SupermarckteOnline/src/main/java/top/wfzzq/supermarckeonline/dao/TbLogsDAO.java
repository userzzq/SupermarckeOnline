package top.wfzzq.supermarckeonline.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import top.wfzzq.supermarckeonline.entity.TbLogs;

@Mapper
public interface TbLogsDAO {
    /**
     * 分页查询
     * 
     * @return
     * @throws Exception
     */
    public List<TbLogs> queryAll(TbLogs logs) throws Exception;

    /**
     * 添加log
     * 
     * @param tbLogs
     * @return
     * @throws Exception
     */
    public int add(TbLogs tbLogs) throws Exception;
}
