package mvc.Dao;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import mvc.model.Student;
@Mapper
public interface StudentDao {
    @Select("SELECT * FROM branch1 WHERE name like #{name}")
    List<Student> find(@Param("name") String name);
    @Insert("INSERT INTO branch1 (name,city,assest ) VALUES (#{name},#{city},#{assest})")
    void  insert(Student stu);
    @Delete("DELETE FROM branch1 WHERE name=#{name}")
    void delete(@Param("name") String name);
    @Update("Update branch1 set branch.assest=#{assest},branch.city=#{city} WHERE branch.name=#{name}")
            void update(Student stu);
    @Select("SELECT * FROM branch1")
    List<Student> findall();


}