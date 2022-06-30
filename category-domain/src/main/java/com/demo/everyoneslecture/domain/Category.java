package main.java.com.demo.everyoneslecture.domain;

@Entity
public class Category {
    
    @Id @GeneratedValue
    private Long categoryId;
        public Long getCategoryId() {
            return categoryId;
        }
    
    private String categoryName;
        public String getCategoryName() {
            return categoryName;
        }
        public void setCategoryName(String categoryName) {
            this.categoryName = categoryName;
        }
        
    
    @PostPersist
    public void onPostPersist(){
        CategoryReserved categoryReserved = new CategoryReserved();
        categoryReserved.setCategoryName(this.getCategoryName());

        categoryReserved.publishAfterCommit();
    }

    // @PostUpdate
    // public void onPostUpdate(){
    //     CategoryUpdated categoryUpdated = new CategoryUpdated();
    //     categoryUpdated.setCategoryName(this.getCategoryName());

    //     categoryUpdated.publishAfterCommit();
    // }

    // @PostRemove
    // public void onPostRemove(){
    //     CategoryRemoved categoryRemoved = new CategoryRemoved();

    //     categoryRemoved.publishAfterCommit();
    // }
}
