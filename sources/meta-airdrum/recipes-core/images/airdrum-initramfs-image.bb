# will be used for the update image
DESCRIPTION = "initramfs updater image"
LICENSE = "MIT"

# Do not pollute the initrd image with rootfs features
IMAGE_FEATURES = ""

export IMAGE_BASENAME = "airdrum-initramfs-image"
IMAGE_LINGUAS = ""

PACKAGE_INSTALL = "\
  base-files \
  base-passwd \
  busybox \
  mtd-utils \
  mtd-utils-ubifs \
  e2fsprogs \
  e2fsprogs-mke2fs \
  e2fsprogs-e2fsck \
  e2fsprogs-tune2fs \
  util-linux-fsck \
  util-linux-fdisk \
  "
IMAGE_FSTYPES = "${INITRAMFS_FSTYPES}"
inherit core-image

IMAGE_ROOTFS_SIZE = "8192"
IMAGE_ROOTFS_EXTRA_SPACE = "0"
BAD_RECOMMENDATIONS += "busybox-syslog busybox-udhcpc"