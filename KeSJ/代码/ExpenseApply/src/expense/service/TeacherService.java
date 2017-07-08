package expense.service;

import expense.DAO.TeacherDAO;
import expense.model.Teacher;

/**
 * Created by lenovo on 2017/7/7 0007.
 */
public class TeacherService {

        private TeacherDAO teacherDAO;

        public TeacherDAO getTeacherDAO() {
            return teacherDAO;
        }

        public void setTeacherDAO(TeacherDAO teacherDAO) {
            this.teacherDAO = teacherDAO;
        }
        public Teacher findTeacher(String barcode) {
            return teacherDAO.findTeacher(barcode);
        }
        public void addTacher(Teacher teacher) {

            teacherDAO.addTeacher(teacher);
        }
        public void modifyTeacher(Teacher teacher) {
            teacherDAO.modifyTeacher(teacher);
        }


    }

