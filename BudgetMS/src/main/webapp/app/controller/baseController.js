/**
 * 等待初始化 name: ,stores : [], views : [], models : [], init : function() .....
 */
Ext.define('BudgetMS.controller.baseController', {
	extend : 'Ext.app.Controller',
	views : [ 'ux.button.showAddBtn', 'ux.button.doAddBtn',
			'ux.button.showUpdBtn', 'ux.button.doUpdBtn', 'ux.button.doFindBtn',
			'ux.button.doDelBtn' ]

});
