package robertpranjic.swetz;

import com.intellij.ide.ui.LafManager;
import com.intellij.ide.ui.LafManagerListener;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class SwetzApplicationComponent implements LafManagerListener {
    public void lookAndFeelChanged(@NotNull LafManager source) {
        updateProgressBarUi();
    }

    private void updateProgressBarUi() {
        UIManager.put("ProgressBarUI", SwetzProgressBarUi.class.getName());
        UIManager.getDefaults().put(SwetzProgressBarUi.class.getName(), SwetzProgressBarUi.class);
    }
}
