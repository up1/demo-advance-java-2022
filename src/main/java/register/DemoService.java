package register;

public class DemoService {

    /**
     * 1 => Result = 2
     * 2 => Result = 3
     * @param id
     * @return
     */
    public String compute(int id) {
        DB db = new DB();
        return "Result = " + db.increaseOne(id);
    }

}

class DB {
    int increaseOne(int id) {
        // return id + 1
        throw new RuntimeException("Under construction");
    }
}
