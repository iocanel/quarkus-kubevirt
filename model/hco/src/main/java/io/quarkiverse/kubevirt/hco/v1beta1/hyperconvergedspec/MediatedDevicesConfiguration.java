package io.quarkiverse.kubevirt.hco.v1beta1.hyperconvergedspec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "mediatedDevicesTypes", "nodeMediatedDeviceTypes" })
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@lombok.ToString()
@lombok.EqualsAndHashCode()
@io.sundr.builder.annotations.Buildable(editableEnabled = false, validationEnabled = false, generateBuilderPackage = false, builderPackage = "io.fabric8.kubernetes.api.builder", refs = {
        @io.sundr.builder.annotations.BuildableReference(io.fabric8.kubernetes.api.model.ObjectMeta.class),
        @io.sundr.builder.annotations.BuildableReference(io.fabric8.kubernetes.api.model.ObjectReference.class),
        @io.sundr.builder.annotations.BuildableReference(io.fabric8.kubernetes.api.model.LabelSelector.class),
        @io.sundr.builder.annotations.BuildableReference(io.fabric8.kubernetes.api.model.Container.class),
        @io.sundr.builder.annotations.BuildableReference(io.fabric8.kubernetes.api.model.EnvVar.class),
        @io.sundr.builder.annotations.BuildableReference(io.fabric8.kubernetes.api.model.ContainerPort.class),
        @io.sundr.builder.annotations.BuildableReference(io.fabric8.kubernetes.api.model.Volume.class),
        @io.sundr.builder.annotations.BuildableReference(io.fabric8.kubernetes.api.model.VolumeMount.class)
})
public class MediatedDevicesConfiguration implements io.fabric8.kubernetes.api.model.KubernetesResource {

    @com.fasterxml.jackson.annotation.JsonProperty("mediatedDevicesTypes")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<String> mediatedDevicesTypes;

    public java.util.List<String> getMediatedDevicesTypes() {
        return mediatedDevicesTypes;
    }

    public void setMediatedDevicesTypes(java.util.List<String> mediatedDevicesTypes) {
        this.mediatedDevicesTypes = mediatedDevicesTypes;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("nodeMediatedDeviceTypes")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.quarkiverse.kubevirt.hco.v1beta1.hyperconvergedspec.mediateddevicesconfiguration.NodeMediatedDeviceTypes> nodeMediatedDeviceTypes;

    public java.util.List<io.quarkiverse.kubevirt.hco.v1beta1.hyperconvergedspec.mediateddevicesconfiguration.NodeMediatedDeviceTypes> getNodeMediatedDeviceTypes() {
        return nodeMediatedDeviceTypes;
    }

    public void setNodeMediatedDeviceTypes(
            java.util.List<io.quarkiverse.kubevirt.hco.v1beta1.hyperconvergedspec.mediateddevicesconfiguration.NodeMediatedDeviceTypes> nodeMediatedDeviceTypes) {
        this.nodeMediatedDeviceTypes = nodeMediatedDeviceTypes;
    }
}
