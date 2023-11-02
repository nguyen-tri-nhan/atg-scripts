import internal.GlobalVariable as GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

'step 1: Navigate to Page home'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/')

'step 2: At Page home click on hyperlink nhan nguyen mybigcommerce com bath --> navigate to Page bath'

testObj = findTestObject('Object Repository/Page_home/hyperlink_nhan_nguyen_mybigcommerce_com_bath')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 3: At Page bath  click on hyperlink nhan nguyen mybigcommerce com kitchen --> navigate to Page kitchen'

testObj = findTestObject('Object Repository/Page_bath/hyperlink_nhan_nguyen_mybigcommerce_com_kitchen')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/bath(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 4: At Page kitchen  click on hyperlink nhan nguyen mybigcommerce com publicatio --> navigate to Page publications'

testObj = findTestObject('Object Repository/Page_kitchen/hyperlink_nhan_nguyen_mybigcommerce_com_publicatio')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/kitchen(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 5: At Page publications  click on hyperlink nhan nguyen mybigcommerce com shop all --> navigate to Page shop-all'

testObj = findTestObject('Object Repository/Page_publications/hyperlink_nhan_nguyen_mybigcommerce_com_shop_all')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/publications(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 6: At Page shop-all  click on hyperlink nhan nguyen mybigcommerce com shipping r --> navigate to Page shipping-returns'

testObj = findTestObject('Object Repository/Page_shop-all/hyperlink_nhan_nguyen_mybigcommerce_com_shipping_r')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/shop-all(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 7: At Page shipping-returns  click on hyperlink nhan nguyen mybigcommerce com garden --> navigate to Page garden'

testObj = findTestObject('Object Repository/Page_shipping-returns/hyperlink_nhan_nguyen_mybigcommerce_com_garden')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/shipping-returns(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 8: Add visual checkpoint at Page garden'

WebUI.takeFullPageScreenshotAsCheckpoint('TC2-Verify Successful Navigation to Garden Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
