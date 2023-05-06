# Base this image on core-image-minimal
include recipes-core/images/core-image-minimal.bb


# Include modules in rootfs
IMAGE_INSTALL += " \
kernel-modules \
python3 \
python3-numpy \
nano \
python3-pip \
packagegroup-rpi-test \
"

IMAGE_FEATURES += "ssh-server-dropbear \
debug-tweaks \
tools-debug \
tools-profile \
package-management \
ssh-server-openssh \
"

