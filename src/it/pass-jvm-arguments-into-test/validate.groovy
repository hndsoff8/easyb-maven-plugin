// Verify behavior report
report = new File("${basedir}/target/easyb-report.xml")
assert report.exists()

def results = new XmlParser().parse(report)
assert '1' == results.'@totalbehaviors'
assert '0' == results.'@totalfailedbehaviors'
