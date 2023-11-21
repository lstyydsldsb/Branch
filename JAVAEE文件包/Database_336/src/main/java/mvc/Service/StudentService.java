package mvc.Service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import mvc.Dao.StudentDao;
import mvc.model.Student;
@Service
public class StudentService {
    @Autowired
    private StudentDao dao;
    public List<Student> findstu(String name) { return dao.find(name+'%'); }
    public void insertstu(Student stu) {  dao.insert(stu);}
    public void deletestu(String name) { dao.delete(name); }
    public void updatestu(Student stu) { dao.update(stu); }
    public List<Student> findall() { return dao.findall(); }
}