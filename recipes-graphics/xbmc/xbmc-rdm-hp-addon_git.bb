DESCRIPTION = "XBMC HomePilot addon"

LICENSE = "GPLv2"
DEPENDS += "xbmc"
LICENSE = "GPLv3"
#LIC_FILES_CHKSUM = "file://script.homepilot/LICENSE.txt;md5=7226e01ff2d738e2246d467214c409b9"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-3.0;md5=c79ff39f19dfec6d293b95dea7b07891"

PR = "r0"
PV = "0.9.5"
SRC_URI = "git://github.com/rehsack/xbmc-rdm-hp-addon.git"
SRCREV = "81bc920d249b0691f984553921ed2da4b49609f0"

S = "${WORKDIR}/git/script.homepilot/"
do_install() {
        install -d ${D}/home/root/.xbmc/addons/
        cp -axr ${S} ${D}/home/root/.xbmc/addons/
}

FILES_${PN} += "/home/root/.xbmc/addons/script.homepilot"
