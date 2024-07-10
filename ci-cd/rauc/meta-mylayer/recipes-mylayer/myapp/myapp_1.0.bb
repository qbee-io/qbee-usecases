DESCRIPTION = "Hello World C file recipe"
SECTION = "base"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://${WORKDIR}/COPYRIGHT;md5=0edab6e76e7da7f1573a394999c7fe8f"

PR = "r0"
TARGET_CC_ARCH += "${LDFLAGS}"

SRC_URI = "file://hello.c \
          file://COPYRIGHT"

do_compile () {
         ${CC} ${WORKDIR}/hello.c -o ${WORKDIR}/hello
}

do_install () {

       install -d ${D}${bindir}
       install -m 0755 ${WORKDIR}/hello ${D}${bindir}/
}
