import org.evomaster.client.java.controller.EmbeddedSutController;
import org.evomaster.client.java.controller.InstrumentedSutStarter;
import org.evomaster.client.java.controller.api.dto.AuthenticationDto;
import org.evomaster.client.java.controller.api.dto.SutInfoDto;
import org.evomaster.client.java.controller.internal.SutController;
import org.evomaster.client.java.controller.problem.ProblemInfo;
import org.evomaster.client.java.controller.problem.RestProblem;
import org.heigit.ohsome.ohsomeapi.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.sql.Connection;
import java.util.List;

public class EMDriver extends EmbeddedSutController {

    private ConfigurableApplicationContext ctx;

    public static void main(String[] args){

        SutController controller = new EMDriver();
        InstrumentedSutStarter starter = new InstrumentedSutStarter(controller);

        starter.start();
    }

    @Override
    public boolean isSutRunning() {
        return ctx != null && ctx.isRunning();
    }

    @Override
    public String getPackagePrefixesToCover() {
        return "org.heigit.ohsome.ohsomeapi";
    }

    @Override
    public List<AuthenticationDto> getInfoForAuthentication() {
        return null;
    }

    @Override
    public Connection getConnection() {
        return null;
    }

    @Override
    public String getDatabaseDriverName() {
        return null;
    }

    @Override
    public ProblemInfo getProblemInfo() {
        return new RestProblem("http://localhost:8080/docs?group=Data%20Aggregation", null);
    }

    @Override
    public SutInfoDto.OutputFormat getPreferredOutputFormat() {
        return SutInfoDto.OutputFormat.JAVA_JUNIT_4;
    }

    @Override
    public String startSut() {
        Application.main(new String[]{
                "--database.db=./src/main/resources/heidelberg.oshdb.mv.db"
        });
        ctx = (ConfigurableApplicationContext) Application.getApplicationContext();

        return "http://localhost:8080";
    }

    @Override
    public void stopSut() {
        ctx.stop();
    }

    @Override
    public void resetStateOfSUT() {

    }
}
