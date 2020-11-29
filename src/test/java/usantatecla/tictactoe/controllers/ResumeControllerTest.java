package usantatecla.tictactoe.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Spy;
import usantatecla.tictactoe.models.Game;
import usantatecla.tictactoe.models.State;

import static org.mockito.Mockito.verify;

public class ResumeControllerTest extends ControllerTest {

    private ResumeController resumeController;

    @Spy
    private State state;

    @BeforeEach
    void beforeStartController() {
        this.resumeController = createController();
    }

    @Override
    protected ResumeController createController() {
        return new ResumeController(new Game(), this.state);
    }

    @Override
    protected void verifyVisitController() {
        verify(this.view).visit((ResumeController) this.controller);
    }

    @Test
    public void testWhenNoResumeShouldChangeNextState() {
        this.resumeController.resume(false);
        verify(this.state).next();
    }

}
