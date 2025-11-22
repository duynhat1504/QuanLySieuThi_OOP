package DataAccess.DataAccessObject;

import java.util.List;

<<<<<<< HEAD
//Interface dùng cho các bản ghi có trong database
public interface ISimpleAccess<T, Id> {
    //Insert datatype T into database by common SQL command: INSERT INTO
    boolean insert(T t);

    //Delete rows has primary key equals to id (or maybe we change property of IS_DELETED to true)
    boolean delete(Id id);

    //Update row has id by t properties
    boolean update(Id id, T t);

    //Get row has id: SELECT * FROM table WHERE id = id
    T select(Id id);
    //Get all rows in the table: SELECT * FROM table
=======
public interface ISimpleAccess <T, Id>{
    boolean insert(T t);
    boolean update(Id id, T t);
    boolean delete(Id id);
    T select(Id id);
>>>>>>> 2b24ea128486abfa78e44d58ca56ebbf88458980
    List<T> selectAll();
}
