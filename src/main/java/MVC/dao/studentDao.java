package MVC.dao;

import MVC.POJO.student;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface studentDao {
       List<student> selectAll();
       List<student> selectById(@Param("id") int i);
}
