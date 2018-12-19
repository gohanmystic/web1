package app.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import app.common.Constants;

@Entity(name = "TestType")
@Table(name = "TEST_TYPE")
public class TestType {

	@Id
    @GeneratedValue(generator = "idGenerator")
    @GenericGenerator(
            name = "idGenerator",
            parameters = @Parameter(name = Constants.PREFIX_PARAM, value = Constants.PREFIX_TEST_TYPE),
            strategy = "app.common.support.GeneratorPrimaryKeySupport")
    @Column(name = "TEST_ID", length = 10)
    private String testTypeId;

    @Column(name = "TEST_TYPE_NAME", length = 50)
    private String testTypeName;

    @OneToMany(mappedBy = "testType", fetch = FetchType.EAGER)
    private List<Test> testList;

    public String getTestTypeId() {
        return testTypeId;
    }

    public void setTestTypeId(String testTypeId) {
        this.testTypeId = testTypeId;
    }

    public String getTestTypeName() {
        return testTypeName;
    }

    public void setTestTypeName(String testTypeName) {
        this.testTypeName = testTypeName;
    }

    public List<Test> getTestList() {
        return testList;
    }

    public void setTestList(List<Test> testList) {
        this.testList = testList;
    }
}
