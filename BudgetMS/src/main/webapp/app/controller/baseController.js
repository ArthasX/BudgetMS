/**
 * 等待初始化 name: ,stores : [], views : [], models : [], init : function() .....
 */
Ext.define('BudgetMS.controller.baseController', {
	extend : 'Ext.app.Controller',
	stores : [ 'fileStore', 'deptStore', 'typeInfoStore' ],
	views : [ 'ux.button.showAddBtn', 'ux.button.doAddBtn',
			'ux.button.showUpdBtn', 'ux.button.doUpdBtn',
			'ux.button.doFindBtn', 'ux.button.doDelBtn',
			'ux.button.fileUploadBtn', 'ux.baseFileGrid', 'dashbord',
			'ux.combo.deptCombo', 'ux.combo.typeInfoCombo' ],
	init : function() {
		console.log('baseController init...')
		// 初始化 部门的 memoryStore
		// debugger;
		// var deptStore = Ext.create('BudgetMS.store.deptStore');
		// deptStore.load();
		// var deptData = deptStore.data;
		// deptMemoryStore = Ext.create('Ext.data.Store', {
		// autoLoad : true,
		// model : 'BudgetMS.model.dept',
		// data : deptData,
		// proxy : {
		// type : 'memory',
		// reader : {
		// type : 'json',
		// }
		// }
		// });
		// // 初始化 类型信息的 memoryStore
		// var typeInfoStore = Ext.create('BudgetMS.store.typeInfoStore');
		// // typeInfoStore.load();
		// var typeInfoData = typeInfoStore.data;
		// typeInfoMemoryStore = Ext.create('Ext.data.Store', {
		// autoLoad : true,
		// model : 'BudgetMS.model.typeInfo',
		// data : deptData,
		// proxy : {
		// type : 'memory',
		// reader : {
		// type : 'json',
		// }
		// }
		// })
	},

});
