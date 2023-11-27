package io.quarkiverse.kubevirt;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.function.Function;

import io.quarkiverse.kubevirt.client.DefaultKubevirtClient;
import io.quarkiverse.kubevirt.client.KubevirtClient;
import io.quarkiverse.kubevirt.common.Table;
import io.quarkiverse.kubevirt.v1.VirtualMachine;
import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Model.CommandSpec;
import picocli.CommandLine.Spec;

@Command(name = "list", sortOptions = false, mixinStandardHelpOptions = false, header = "List Kubevirt VMs")
public class VmList implements Callable<Integer> {

    @Spec
    protected CommandSpec spec;

    @CommandLine.Option(names = { "-h", "--help" }, usageHelp = true, description = "Display this help message.")
    public boolean help;

    @Override
    public Integer call() {
        try {
            KubevirtClient client = new DefaultKubevirtClient();
            List<VirtualMachine> virtualMachines = client.v1().virtualmachines().list().getItems();

            List<String> headers = List.of("Name", "Installed", "Ready");
            List<Function<VirtualMachine, String>> mappers = List.of(
                    t -> t.getMetadata().getName(),
                    t -> t.getMetadata().getNamespace(),
                    t -> t.getStatus().getReady() ? " * " : "  ");

            Table<VirtualMachine> table = new Table<>(headers, mappers, virtualMachines);
            table.print();
            return CommandLine.ExitCode.OK;
        } catch (Exception e) {
            e.printStackTrace();
            return CommandLine.ExitCode.SOFTWARE;
        }
    }
}
