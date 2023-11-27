package io.quarkiverse.kubevirt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

class KubevirtCommandOutput implements Runnable {
    private final InputStream is;

    KubevirtCommandOutput(InputStream is) {
        this.is = is;
    }

    @Override
    public void run() {
        try (InputStreamReader isr = new InputStreamReader(is);
                BufferedReader reader = new BufferedReader(isr)) {

            for (String line = reader.readLine(); line != null; line = reader.readLine()) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error displaying command output.");
        }
    }
}
